package bullet;

public class BulletPool extends MemoryPool {
    @Override
    protected Object allocate() {
        return new Bullet();
    }
}
