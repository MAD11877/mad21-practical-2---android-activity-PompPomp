package sg.edu.np.madpractical2_activity;

public class User {
    public String Name;
    public String Description;
    public int ID;
    public boolean Followed;

    public User(String n, String d, int id, boolean f){
        Name = n;
        Description = d;
        ID = id;
        Followed = f;
    }
}
