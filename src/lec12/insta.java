package lec12;

class Instagram {
    private String idname;
    private int followercount;
    private int followingcount;
    private String bio;
    private int postcount;

    public Instagram(String idname, int followercount, int followingcount, String bio, int postcount) {
        this.idname = idname;
        this.followercount = followercount;
        this.followingcount = followingcount;
        this.bio = bio;
        this.postcount = postcount;
    }

    public void showProfile() {
        System.out.println("idname: " + idname);
        System.out.println("followercount: " + followercount);
        System.out.println("followingcount: " + followingcount);
        System.out.println("bio: " + bio);
        System.out.println("postcount: " + postcount);
    }

    public void addFollower() {
        followercount++;
        System.out.println("followercount: " + followercount);
    }

    public void removeFollower() {
        if (followercount > 0) {
            followercount--;
            System.out.println("followercount: " + followercount);
        } else {
            System.out.println("no follower to remove");
        }
    }

    public void followSomeone() {
        followingcount++;
        System.out.println("followingcount: " + followingcount);
    }

    public void unfollowSomeone() {
        if (followingcount > 0) {
            followingcount--;
            System.out.println("followingcount: " + followingcount);
        } else {
            System.out.println("not following someone");
        }
    }

    public void updateBio(String newBio) {
        bio = newBio;
        System.out.println("bio updated: " + bio);
    }

    public void password(int pin) {
        if (pin == 12345) {
            System.out.println("password is correct");
        } else {
            System.out.println("password is incorrect");
        }
    }

    public void addPost() {
        postcount++;
        System.out.println("new post added! total posts: " + postcount);
    }

    public void deletePost() {
        if (postcount > 0) {
            postcount--;
            System.out.println("Post deleted. Total posts: " + postcount);
        } else {
            System.out.println("No posts to delete!");
        }
    }
}

public class insta {
    public static void main(String[] args) {
        Instagram profile = new Instagram("charu patel", 0, 0, "coder&debugger", 5);

        profile.showProfile();
        profile.addFollower();
        profile.addFollower();
        profile.followSomeone();
        profile.removeFollower();
        profile.unfollowSomeone();
        profile.password(12345);
        profile.updateBio("learning java from starting");
        profile.addPost();
        profile.addPost();
        profile.deletePost();
        profile.showProfile();
    }
}

