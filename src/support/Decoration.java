package support;

interface Decoration<T> {

    void light();
    void door();
    void wallpaper();

    T saleGiftCard();
    void useCard(T t);
}
