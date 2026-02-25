package com.tutorial.part4;

import liquidjava.specification.ExternalRefinementsFor;
import liquidjava.specification.Ghost;
import liquidjava.specification.Refinement;
import liquidjava.specification.StateRefinement;

@ExternalRefinementsFor("java.util.ArrayList")
@Ghost("int size")
public interface ArrayListRefinements<E> {

	@StateRefinement(to="size() == 0")
	public void ArrayList();

	@StateRefinement(to="size() == size(old(this)) + 1")
	public boolean add(E elem);

	public E get(@Refinement("0 <= _ && _ < size()") int index);
}