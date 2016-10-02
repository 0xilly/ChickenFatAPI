package us.illyohs.chickenfat.api.consumable;

public enum  ConsumableTypes
{
    FOOD("food"),
    DRINK("drink");

    String type;

    ConsumableTypes(String type)
    {
        this.type = type;
    }

    public String getTypeName()
    {
        return type;
    }
}
