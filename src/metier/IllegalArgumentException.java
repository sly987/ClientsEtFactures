package metier;

public class IllegalArgumentException extends Exception {
	public IllegalArgumentException() 
	{
		System.out.println("Exception IllegalArgumentException has been  raised...");
	}
	public String toString()
	{
		return "Le montant d'une facture ne peut pas être négatif.";
	}

}
