package factory.interfaces;

import animals.interfaces.Cats;
import animals.interfaces.Dogs;
// фабрика по созданию животных
public interface AnimalsFactory {

    // что фабрика будет производить

    Cats createCats();// животные семейства кошачьих

    Dogs createDogs(); // животные семейства собачьих
}
