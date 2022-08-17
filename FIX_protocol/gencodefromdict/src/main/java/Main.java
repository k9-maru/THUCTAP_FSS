import org.apache.maven.plugin.MojoExecutionException;

public class Main {
    public static void main(String[] args) throws MojoExecutionException {
        GenerateMojo generateMojo = new GenerateMojo();

        generateMojo.execute();
    }
}
