public class BulletPool extends MemoryPool<Bullet>{
    protected Bullet allocate(){
        return new Bullet();
    }
}
