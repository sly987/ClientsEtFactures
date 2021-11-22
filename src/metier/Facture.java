package metier;

import java.time.LocalDate;

public class Facture
{
	private int montantFacture;
	private LocalDate date;
	private boolean reglementFacture;
	private String nom;
	
	public Facture(int montant)
	{
		montantFacture  = montant;
	}
	
	public Facture(int montant, boolean reglement)
	{
		montantFacture  = montant;
		reglementFacture = reglement;
	}
	public Facture(int montant, String nom, boolean reglement, LocalDate date )
	{
		montantFacture  = montant;
		reglementFacture = reglement;
		this.nom = nom;
		this.date = date;
	}
	/**
	 * Retourne le client à qui est adressée la facture..
	 * @return le client.
	 */
	
	public Client getClient()
	{
		Client client = new Client(nom);
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
		date = LocalDate.now();
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

		
		return null;
	}
}