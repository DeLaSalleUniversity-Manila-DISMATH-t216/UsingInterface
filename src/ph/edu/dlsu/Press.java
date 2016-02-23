package ph.edu.dlsu;

import ph.edu.dlsu.Olive.Olive;

import java.util.Collection;

public interface Press {
    public void getOil(Collection<Olive> olives);
    public int getTotalOil();
    public void setTotalOil(int totalOil);
}
