
/**
 * Lab 0129 It's Me Mario
 *
 * @author (Grace Jau)
 * @version (0129)
 */
public class Main
{
    public static void main(){
        Character mario = new Mario("It's me Mario", 0);
        System.out.println(mario.getCatchphrase());
        mario.setSpeed(100);
        System.out.println(mario.getSpeed());
    }
}
