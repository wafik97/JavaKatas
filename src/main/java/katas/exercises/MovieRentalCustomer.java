package katas.exercises;

import katas.exercises.movieRental.Movie;
import katas.exercises.movieRental.Rental;

import java.util.ArrayList;
import java.util.List;

/**
 * This source code follows Martin Fowler's book "Refactoring, Improving the Design of Existing Code".
 * When you find you have to add a feature to a program, and the program's code is not
 * structured in a convenient way to add the feature, first refactor the program to make it
 * easy to add the feature, then add the feature.
 *
 * Whenever you do refactoring, you MUST build a solid set of tests for that section of code.
 *
 * The `statement` method prints out a simple text output of a rental statement:
 *
 *      Rental Record for martin
 *        Ran 3.5
 *        Trois Couleurs: Bleu 2.0
 *      Amount owed is 5.5
 *      You earned 2 frequent renter points
 *
 *
 * We want to write an HTML version of the statement method :
 *
 *      <h1>Rental Record for <em>martin</em></h1>
 *      <table>
 *        <tr><td>Ran</td><td>3.5</td></tr>
 *        <tr><td>Trois Couleurs: Bleu</td><td>2.0</td></tr>
 *      </table>
 *      <p>Amount owed is <em>5.5</em></p>
 *      <p>You earned <em>2</em> frequent renter points</p>
 *
 * Carfully think how to refactor this code, and write the corresponding tests under MovieRentalCustomerTest.
 */
public class MovieRentalCustomer {

    private int HTMLOrNot;
    private final String _name;
    private final List<Rental> _rentals = new ArrayList<Rental>();

    public MovieRentalCustomer(String name) {
        _name = name;
    }

    public void addRental(Rental rental) {
        _rentals.add(rental);
    }

    public String getName() {
        return this._name;
    }

    public String statement() {
        HTMLOrNot =0;
        return myStatement();
    }

    public String htmlStatement() {

        HTMLOrNot =1;
        return myStatement();

    }

    public String myStatement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        StringBuilder result = new StringBuilder(header());
        for (Rental rental : _rentals) {
            double thisAmount = calculateRentalAmount(rental);
            frequentRenterPoints += calculateFrequentRenterPoints( rental);
            result.append(createRentalDataRow(rental.getMovie().getTitle(),thisAmount));
            totalAmount += thisAmount;
        }
        result.append(createFooter(totalAmount,frequentRenterPoints));

        return result.toString();


    }




    private String header() {
        if(HTMLOrNot==1) {
            return "<h1>Rental Record for <em>" + getName() + "</em></h1>\n" + "<table>\n";
        }
        else {
            return "Rental Record for " + getName() + "\n" ;
        }
    }


    private double calculateRentalAmount(Rental rental) {
        double amount = 0;
        switch (rental.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                amount += 2;
                if (rental.getDaysRented() > 2)
                    amount += (rental.getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                amount += rental.getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                amount += 1.5;
                if (rental.getDaysRented() > 3)
                    amount += (rental.getDaysRented() - 3) * 1.5;
                break;
        }
        return amount;
    }

    private int calculateFrequentRenterPoints(Rental rental) {
        int frequentRenterPoints=1;
        if ((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE) && rental.getDaysRented() > 1) {
            frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }

    private String createRentalDataRow(String movieTitle, double amount) {
        if(HTMLOrNot==1) {
            return "\t<tr><td>" + movieTitle + "</td><td>" + amount + "</td></tr>\n";
        }
        else {
            return  "\t" + movieTitle + "\t" + amount + "\n";
        }
    }


    private String createFooter(double totalAmount, int frequentRenterPoints) {
        if(HTMLOrNot==1) {
            return "</table>\n" + "<p>Amount owed is <em>" + totalAmount + "</em></p>\n" +
                    "<p>You earned <em>" + frequentRenterPoints + "</em> frequent renter points</p>\n";
        }
        else{
            return "Amount owed is " + String.valueOf(totalAmount) + "\n"+
                    "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        }
    }




}
