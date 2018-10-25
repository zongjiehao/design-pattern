package com.haozj;

public class Price {
    private MemberStrategy memberStrategy;

    /**
     * 传入具体的策略对象
     * @param memberStrategy
     */
    public Price(MemberStrategy memberStrategy) {
        this.memberStrategy = memberStrategy;
    }
    public double quote(double booksPrice){
        return this.memberStrategy.calcPrice(booksPrice);
    }

}
