package com.example.Dop_MailOperations.bagOperations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class BagDaoService {
	
	private static List<BagDetails> bags=new ArrayList<>();
	
	public BagDetails save(BagDetails bag) {
		bags.add(bag);
		return bag;
	}
	
	
	public List<BagDetails> findAll(){
		return bags;
	}

}
