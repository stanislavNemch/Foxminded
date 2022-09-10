package ua.com.foxminder.carmanager;

public interface Serviceable {

    public boolean isReadyToService();
    public int getDistanceOnService();
    public void addDistance(int additinalDistance);
    public void addDistance(double additinalDistance);
}
