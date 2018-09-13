package cardshuffler;


class Card
{
    private int value;
    private char suit;
    public Card(int value, char suit)
    {
        this.value = value;
        this.suit = suit;
    }
    public int getValue()
    {
        return this.value;
    }
    public char getSuit()
    {
        return this.suit;
    }
    public String toString()
    {
        String value1 = Integer.toString(value);
        switch (value) {
            case 1:
                value1 = "A";
                break;
            case 11:
                value1 = "J";
                break;
            case 12:
                value1 = "Q";
                break;
            case 13:
                value1 = "K";
                break;
            default:
                value1 = value1;
                break;
        }
        String suit1 = String.valueOf(suit);
        return String.format(value1 + suit1);
    }
    public boolean equals(Object o)
    {
        if (o == this)
        {
            return true;
        }
        if (!(o instanceof Card))
        {
            return false;
        }
        Card c1 = (Card)o;
        return this.toString().equals(c1.toString());
    }
}
public class CardShuffler
{
    public static void main(String[] args)
    {
        Card c1 = new Card(11, 'c');
        Card c2 = new Card(10, 'd');
        Card c3 = new Card(11, 'c');
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(c1.equals(c3));
        System.out.println(c1.equals(c2));
        }
}

