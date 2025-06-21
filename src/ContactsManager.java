public class ContactsManager {

        Contact[] myFriends;
        int friendsCount;

        public ContactsManager() {
            myFriends = new Contact[500]; // Capacité maximale
            friendsCount = 0;
        }

        public void addContact(Contact contact) {
            myFriends[friendsCount] = contact;
            friendsCount++;
        }

        public Contact searchContact(String name) {
            for (int i = 0; i < friendsCount; i++) {
                if (myFriends[i].name.equalsIgnoreCase(name)) {
                    return myFriends[i];
                }
            }
            return null; // Pas trouvé
        }


}
