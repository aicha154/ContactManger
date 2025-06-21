//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                // Création du gestionnaire
                ContactsManager myContactsManager = new ContactsManager();

                // Ajout de 5 contacts
                Contact contact1 = new Contact();
                contact1.name = "Alice";
                contact1.phoneNumber = "0505050505";
                myContactsManager.addContact(contact1);

                Contact contact2 = new Contact();
                contact2.name = "Himrane";
                contact2.phoneNumber = "0404040404";
                myContactsManager.addContact(contact2);

                Contact contact3 = new Contact();
                contact3.name = "Charlie";
                contact3.phoneNumber = "0303030303";
                myContactsManager.addContact(contact3);

                Contact contact4 = new Contact();
                contact4.name = "Nozene";
                contact4.phoneNumber = "0202020202";
                myContactsManager.addContact(contact4);

                Contact contact5 = new Contact();
                contact5.name = "Mohi";
                contact5.phoneNumber = "0101010101";
                myContactsManager.addContact(contact5);

                // Recherche d’un contact
                String nomRecherche = "Charlie";
                Contact contactTrouve = myContactsManager.searchContact(nomRecherche);

                if (contactTrouve != null) {
                    System.out.println("Numéro de " + nomRecherche + " : " + contactTrouve.phoneNumber);
                } else {
                    System.out.println(nomRecherche + " n’a pas été trouvé dans les contacts.");
                }
            }

}