package com.tcg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcg.model.Card;
import com.tcg.repository.CardRepository;

@RestController
@RequestMapping("/card")
public class CardController {
	
	@Autowired
	private CardRepository cardRepo;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public List<Card> index()
	{
		System.out.println( cardRepo.findAll() );
		
		return cardRepo.findAll();
	}
	
	@RequestMapping(value="/name/{name}", method=RequestMethod.GET)
	public Card selectByName(@PathVariable String name)
	{
		return cardRepo.findByName(name);
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public Card addCard(Card card)
	{
		if( cardRepo.findByName( card.getName() ) != null )
			return null;

		return cardRepo.save(card);		
	}

	@RequestMapping(method=RequestMethod.POST)
	public Card modifyCard(Card card)
	{
		Card findName = cardRepo.findByName( card.getName() );
		
		if( findName != null )
		{
			card.setId(findName.getId());
			return cardRepo.save(card);
		}
		
		return cardRepo.save(card);
	}
	
	@RequestMapping(method=RequestMethod.DELETE)
	public void removeAll()
	{
		cardRepo.deleteAll();
	}
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void removeById(@PathVariable String id)
	{
		cardRepo.delete(id);
	}
	@RequestMapping(value="/name/{name}",method=RequestMethod.DELETE)
	public void removeByName(@PathVariable String name)
	{
		cardRepo.deleteByName(name);
	}
}
