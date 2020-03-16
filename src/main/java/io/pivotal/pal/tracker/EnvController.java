package io.pivotal.pal.tracker;


@RestController
public class EnvController{

    private final String port;
    private final String memoryLimit;
    private final String cfInstanceIndex;
    private final String cfInstanceAddress;

    public EnvController(@Value("${port:NOT SET}") String port, @Value("${memoryLimit:NOT SET}") String memoryLimit,@Value("${cfInstanceIndex:NOT SET}")  String cfInstanceIndex,
                         @Value("${cfInstanceAddress:NOT SET}") String cfInstanceAddress) {
        this.port = port;
        this.memoryLimit = memoryLimit;
        this.cfInstanceIndex = cfInstanceIndex;
        this.cfInstanceAddress = cfInstanceAddress;
    }

    @GetMapping(/env)
    public String getEnv(){
        Map<String,String> env=new Map<String,String>;

        env.put("PORT",port);
        env.put("MEMORY_LIMIT", memoryLimit);
        env.put("CF_INSTANCE_INDEX", cfInstanceIndex);
        env.put("CF_INSTANCE_ADDR", cfInstanceAddress);

        return env;
    }
}