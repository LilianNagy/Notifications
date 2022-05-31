package Gateways;

public class Context {
	   private Gateway strategy;

	   public Context(Gateway strategy){
	      this.strategy = strategy;
	   }

	   public void execute(Object message, String user){
	      strategy.sendMessage( message , user);
	   }
	}
