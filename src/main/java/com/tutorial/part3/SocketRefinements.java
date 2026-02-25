package com.tutorial.part3;

import liquidjava.specification.ExternalRefinementsFor;
import liquidjava.specification.StateRefinement;
import liquidjava.specification.StateSet;
import java.net.SocketAddress;

@ExternalRefinementsFor("java.net.Socket")
@StateSet({"unconnected", "bound", "connected", "closed"})
public interface SocketRefinements {
	
	@StateRefinement(to="unconnected()")
	public void Socket();
	
	@StateRefinement(from="unconnected()", to="bound()")
	public void bind(SocketAddress add);
	
	@StateRefinement(from="bound()", to="connected()")
	public void connect(SocketAddress add);
	
	@StateRefinement(from="connected()")
	public void sendUrgentData(int n);
	
	@StateRefinement(from="!closed()", to="closed()")
	public void close();
}
