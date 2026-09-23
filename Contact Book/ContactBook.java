import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class ContactBook
{
    private ArrayList<String> contacts;
    public ContactBook() {
    contacts = new ArrayList<>();
    }
    public void addContact(String name)
    {
        contacts.add(name);
    
    }
    
    public void listAllContacts() {
        for (String card: contacts) {
        System.out.println(card);
        }
    }
    
    public boolean containsContact(String name) {
        
        for (String card:contacts) {
            if (card.equals(name)) {
                return true;
            }
        }
        return false;
    }
    
    public void removeContactNamed(String name) {
        Iterator<String> it = contacts.iterator();
        while(it.hasNext()) {
            if (it.next().equals(name)) {
                it.remove();
            }
        }
    
    }
    
    public int getNumberOfContacts() {
        return contacts.size();
    }
}