public class Team {
    Member member;

    public Team(Member member){ // who is in this Team?
        this.member = member;   // one 'member' is in this Team!
    }

    // main method
    public static void main(String[] args) {
        Member myMember = new Member("Chema", "light", 10, 1);
        //Member secondMember = new Member("Andrés", "dark", 5, 5);
        Team myTeam = new Team(myMember);
        System.out.println(myTeam.member.getName());
        System.out.println(myTeam.member.getType());
        System.out.println(myTeam.member.getLevel());
        System.out.println(myTeam.member.getRank());
    }
}

//----------------------------------------------------------------------------------------------------
// Diferent class
class Member {
    private String name;    // private variables can be returned only through getter functions
    private String type;    // like asking someone this info instead of taking its id
    private int level;
    private int rank;

    // Constructor
    public Member(String name, String type, int level, int rank){
        this.name = name;
        this.type = type;
        this.level = level;
        this.rank = rank;
    }

    /* getter functions */
    public String getName(){    // what is your name?
        return this.name;   // my name is...
    }

    public String getType(){    // what is your type?
        return this.type;   // my type is...
    }

    public int getLevel(){  // what is your level?
        return this.level;  // my level is...
    }

    public int getRank(){   // what is your rank?
        return this.rank;   //my rank is
    }
}