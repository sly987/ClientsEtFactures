package metier;

import java.time.LocalDate;

public class Facture
{
	private int montantFacture;
	private LocalDate date;
	private boolean reglementFacture =false;
	private Client client;

	
	public Facture(int montant, Client client)
	{
		try
		{
			montantFacture  = montant;
			this.client = client;
			date = LocalDate.now();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	public Facture(int montant, boolean reglement, Client client)
	{
		try
		{
			montantFacture  = montant;
			reglementFacture = reglement;
			this.client = client;
			date = LocalDate.now();
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e);
		}
	}
	public Facture(int montant, boolean reglement, Client client, LocalDate date )
	{
		try
		{
			montantFacture  = montant;
			reglementFacture = reglement;
			this.client = client;
			this.date = date;
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e);
		}
	}
	public Facture(Facture f )
	{
		try 
		{
			montantFacture  = f.montantFacture;
			reglementFacture = f.reglementFacture;
			this.client = f.client;
			this.date = f.date;
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e);
		}
	}
	/**
	 * Retourne le client à qui est adressée la facture..
	 * @return le client.
	 */
	
	public Client getClient()
	{
		
		return client;
	}

	/**
	 * Retourne le montant de la facture.
	 * @return le montant de la facture.
	 */
	
	public int getMontant()
	{
		return this.montantFacture;
	}

	/**
	 * Retourne vrai si la facture est reglée.
	 * @return vrai ssi la facture est reglée.
	 */
	
	public boolean estReglee()
	{
		return this.reglementFacture;
		
	}

	/**
	 * Retourne la date de la facture.
	 * @return la date de la facture.
	 */
	
	public LocalDate getDate()
	{
		
		return date;
	}

	/**
	 * Supprime la facture
	 */
	
	public void delete()
	{
		
	}
	
	/**
	 * Duplique la facture.
	 * @return une copie de la facture.
	 */
	
	public Facture copie()
	{
		Facture f = new Facture(this);
		
		return f;
	}
}