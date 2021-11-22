package metier;

import java.util.ArrayList;
import java.util.List;

public class Client
{
	private String nom;
	private List<Facture> list = new ArrayList<>();
	
	/** 
	 * Crée un client.
	 * @param nom le nom du client. 
	 */
	
	public Client(String nom)
	{
		this.setNom(nom);
	}

	/**
	 * Retourne le nom du client.
	 * @return le nom du client.
	 */
	
	public String getNom()
	{
		return nom;
	}
	
	/**
	 * Modifie le nom du client.
	 * @param nom le nom du client.
	 */
	
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	
	/**
	 * Créé une facture.
	 * @param montant Le montant de la facture.
	 * @return la facture créée.
	 */
	
	public Facture createFacture(int montant)
	{
		Facture f = new Facture(montant, this);
		list.add(f);
		return f ;
	}

	/**
	 * Créé une facture en précisant si elle est reglée.
	 * @param montant Le montant de la facture.
	 * @param reglée Vrai si la facture est reglée.
	 * @return la facture créée.
	 */
	
	public Facture createFacture(int montant, boolean reglee)
	{
		Facture f = new Facture(montant, reglee, this);
		list.add(f);
		return f;
	}	
	
	/**
	 * Retourne une copie de la liste des factures du client. 
	 * @return une copie de la liste des factures du client.
	 */

	public List<Facture> getFactures()
	{
		return list;
	}
	
	/**
	 * Retourne la somme des montants des factures.
	 * @return la somme des montants des factures.
	 */
	
	public int sommeMontants()
	{
		int m = 0;
		for(int i = 0; i<list.size(); i++)
		{
			m =+ (list.get(i)).getMontant();
		}
		return m;
	}

	
	/**
	 * Retourne la liste des factures reglées. 
	 * @return la liste des factures reglées.
	 */

	public List<Facture> facturesReglees()
	{
		List<Facture> l = new ArrayList<>();
		for(int i = 0; i<list.size(); i++)
		{
			Facture f = new Facture(list.get(i));
			if(f.estReglee())
			{
				l.add(f);
			}
		}
		return l;
	}
	

	/**
	 * Retourne tous les clients créés.
	 * @return une copie de la liste de tous les clients.
	 */
	public static List<Client> tous()
	{
		return null;
	}
	
	/**
	 * Supprime le client.
	 */
	
	public void delete()
	{
	}
}
