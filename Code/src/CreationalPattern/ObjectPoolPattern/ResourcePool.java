package CreationalPattern.ObjectPoolPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * 资源池类
 * @date:2022/03/27 17:30
 * @author: lyf
 */
public class ResourcePool {

    private List<AbstractResource> inuse = new ArrayList<>();

    private List<AbstractResource> available = new ArrayList<>();

    public Resource acquireResource() {
        if (available.size() <= 0) {
            Resource resource = new Resource();
            inuse.add(resource);
            return resource;
        } else {
            return (Resource) available.remove(0);
        }
    }

    public void releaseResource(Resource resource) {
        available.add(resource);
    }

}
