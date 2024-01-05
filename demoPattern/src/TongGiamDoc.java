public class TongGiamDoc {
    private String id;
    private String name;
    private static TongGiamDoc instance;
    public static TongGiamDoc getInstance(String id,String name){
        if (instance == null){
            synchronized (TongGiamDoc.class){
                if(instance == null){
                    instance = new TongGiamDoc(id,name);
                }
            }
        }
        return instance;
    }

    private TongGiamDoc() {
    }

    private TongGiamDoc(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "TongGiamDoc{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
