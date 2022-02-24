package com.company;

public class Calculator implements CalculableInterface {
    public Double first;
    public char mathChar;
    public Double second;
    public Double res;


    public Calculator(double first, char mathChar, double second) {
        this.first = first;
        this.second = second;
        this.mathChar = mathChar;
    }

    public Calculator() {

    }

    public Double getFirst() {
        return first;
    }

    public void setFirst(Double first) {
        this.first = first;
    }

    public Double getSecond() {
        return second;
    }

    public void setSecond(Double second) {
        this.second = second;
    }

    public char getMathChar() {
        return mathChar;
    }

    public void setMathChar(char mathChar) {
        this.mathChar = mathChar;
    }

    public void setRes(Double res) {
        this.res = res;
    }

    public Double getRes() {
        return res;
    }


    @Override
    public void calculate() {
        if (this.mathChar == '+') {
            add();
        } else if (this.mathChar == '-') {
            subtract();
        } else if (this.mathChar == '*') {
            multiply();
        } else if (this.mathChar == '/') {
            if (this.second == 0) {
                throw new ArithmeticException("You can't divide by " + 0);
            } else setRes(getFirst() / getSecond());
        }
    }

    @Override
    public void add() {
        setRes(getFirst() + getSecond());
    }

    @Override
    public void subtract() {
        setRes(getFirst() - getSecond());
    }

    @Override
    public void multiply() {
        setRes(getFirst() * getSecond());
    }

    @Override
    public void divide() {
        if (mathChar == '/') {
            if (getSecond() == 0) {
                throw new ArithmeticException("You can't divide by " + 0);
            } else setRes(getFirst() / getSecond());
        }
    }
}