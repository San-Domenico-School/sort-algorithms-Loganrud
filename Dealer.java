import greenfoot.*;
import java.util.ArrayList;

/**
 * This class declares, instantiates, and initializes a new deck.  Students 
 * should then implement the sort method at the botton of this class to see 
 * if they understanding basic ArrayList sort algorithms.
 * 
 * @author Bruce Gustin
 * @version Feb 8, 2023
 */

public class Dealer extends Actor
{
    private Deck deck;
    private Card[] shuffledDeck;
    private Card[] selectionSort;
    private Card[] insertionSort;
    private Card[] mergeSort;
    
    // Instantiates a new deck
    public Dealer()
    {
        deck = new Deck();
        shuffledDeck = deck.getShuffledDeck();
        initializeSortArrays();
    }
    
    // Adds cards to board after Deck is initialized
    public void addedToWorld(World world)
    {
        showCards(world, shuffledDeck, 80);
        showCards(world, selectionSort(selectionSort, shuffledDeck.length), 220);
        //for (int i = 0; i < shuffledDeck.length; i ++)
        {
            //world.addObject(shuffledDeck[i], 58 + 30 * i, 220);
        }
        showCards(world, insertionSort(insertionSort, shuffledDeck.length), 360);
        showCards(world, mergeSort(mergeSort, shuffledDeck.length), 500);
    }    
    // Shuffles the unshuffled deck
    
    
    // Sets all the sorted arrays equal to the shuffledCard array
    private void initializeSortArrays()
    {
        selectionSort = new Card[shuffledDeck.length];
        insertionSort = new Card[shuffledDeck.length];
        mergeSort = new Card[shuffledDeck.length];
        
        for(int i = 0; i < shuffledDeck.length; i++)
        { 
            Card card1 = new Card(shuffledDeck[i].getImageFile(),shuffledDeck[i].getValue());
            Card card2 = new Card(shuffledDeck[i].getImageFile(),shuffledDeck[i].getValue());
            Card card3 = new Card(shuffledDeck[i].getImageFile(),shuffledDeck[i].getValue());
            selectionSort[i] = card1;
            insertionSort[i] = card2;
            mergeSort[i] = card3;
        }
    }
    
    // Places card on board at y
    private void showCards(World world, Card[] cards, int y)
    {
        
       for(int i = 0; i < cards.length; i++)
       {
           world.addObject(cards[i],58 + 30 * i, y);
       } 
    }
    
    /* This is where the students attempt their sort algorithm by taking the
     * cards from the shuffled list and adding them to the sorted list.     
    **/
    
    /* In this space write the pseudocode for your selection sort
     *  copmare the 1st cards's 
     * value to the values of all the other cards in each row respectively using .getValue 
     * from the card class, then swap with each card that has a lower value until the 1st
     * card is at the right spot, then repeat.
     * 
     * 
     */
    private Card[] selectionSort(Card[] arr, int n)
    {
        for (int i = 0; i < n; i++) //loops through the deck
        {
            int minIndex = i; //assumes the current card is the smallest value
        
            for (int j = i + 1; j < n; j++)// finds the smallest card in the unsorted deck
            {
                if (arr[j].getValue() < arr[minIndex].getValue())
                {
                    minIndex = j;//updates minIndex if a smaller value is found
                }
            }
            
            if (minIndex != i)//swaps the smallest card with the current card at i
            {
                Card temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        
        return arr;
    }
    
    /* In this space write the pseudocode for your insertion sort
     * take the first element in the array and compare it to the one directly after it, 
     * if the second one is of higher value, then the first card is in the right spot, 
     * if the second card is higher, then compare the first card to the next one and so 
     * on until it finds a lower value then insters into that part of the array, then 
     * repeat for each card.
     * 
     * 
     */
    private Card[] insertionSort(Card[] arr, int n)
    {
         for (int i = 0; i < n; i++)
        {
            Card currentIndex = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j].getValue() > currentIndex.getValue())
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = currentIndex;
        }
        
        
        return insertionSort;
    }
    
    /* In this space write the pseudocode for your merge sort
     * 
     * 
     * 
     */
    private Card[] mergeSort(Card[] arr, int n)
     {
        
        //put sort algorithm here
        
        return mergeSort;
    }
}

