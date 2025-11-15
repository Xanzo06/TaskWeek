package taskweekchapter2;
import java.util.ArrayList;



public class Network {
    private ArrayList<Member> members; // Список участников сети

    // Конструктор Network
    public Network() {
        this.members = new ArrayList<>();
    }

    // Внутренний класс Member
    public class Member {
        private String name;
        private ArrayList<Member> friends;

        public Member(String name) {
            this.name = name;
            this.friends = new ArrayList<>();
        }

        // Метод для выхода участника из сети
        public void leave() {
            // Удаляем текущего участника (this) из списка членов сети
            Network.this.members.remove(this);
        }

        public String getName() {
            return name;
        }
    }

    // Метод для регистрации нового участника
    public Member enroll(String name) {
        Member newMember = new Member(name);
        members.add(newMember);
        return newMember;
    }

    // Метод для получения списка всех участников
    public ArrayList<Member> getMembers() {
        return new ArrayList<>(members); // Возвращаем копию, чтобы не изменять оригинал
    }


    public static void main(String[] args) {
        Network socialNetwork = new Network();

        Network.Member alice = socialNetwork.enroll("Alice");
        Network.Member bob = socialNetwork.enroll("Bob");
        Network.Member charlie = socialNetwork.enroll("Charlie");

        System.out.println("Число участников: " + socialNetwork.getMembers().size());

        alice.leave();

        System.out.println("Число участников после выхода Alice: " + socialNetwork.getMembers().size());
    }
}

