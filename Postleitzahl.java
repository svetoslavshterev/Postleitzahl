public final class Postleitzahl implements Comparable<Postleitzahl>
{
    private final int _postleitzahl;

    private Postleitzahl(int postleitzahl)
    {
        _postleitzahl = postleitzahl;
    }

    public static boolean isValid(int ziffernfolge)
    {
        return (-1 < ziffernfolge) && (ziffernfolge < 100000);
    }

    /**
     * Selektiert eine Postleitzahl gemäß einer Ziffernfolge
     * @param ziffernfolge - Gültige Ziffernfolge zur Selektion einer Postleitzahl
     * @request isValid(ziffernfolge)
     * @return Postleitzahl, die der übergegebenen gültigen Ziffernfolge entspricht
     */

    public static Postleitzahl select(int ziffernfolge)
    {
        assert isValid(
                ziffernfolge) : "Vorbedingung verletzt: isValid(ziffernfolge)";

        return new Postleitzahl(ziffernfolge);
    }

    @Override
    public int compareTo(Postleitzahl other)
    {
        if (_postleitzahl < other.toInt())
        {
            return -1;
        }
        if (_postleitzahl == other.toInt())
        {
            return 0;
        }
        return 1;
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == null) return false;
        return this.hashCode() == other.hashCode();
    }

    @Override
    public int hashCode()
    {
        return _postleitzahl;
    }

    public int toInt()
    {
        return _postleitzahl;
    }

    @Override
    public String toString()
    {
        return "Postleitzahl(" + _postleitzahl + ")";
    }
}
