package beans.io;

import java.io.InputStream;

/**
 * io 的顶级接口
 */
public interface Resource {
    InputStream getInputStream() throws Exception;
}
