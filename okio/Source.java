// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import java.io.IOException;
import java.io.Closeable;

public interface Source extends Closeable
{
    long read(final Buffer p0, final long p1) throws IOException;
    
    Timeout timeout();
    
    void close() throws IOException;
}
