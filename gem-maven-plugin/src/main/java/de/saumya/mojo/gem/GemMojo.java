package de.saumya.mojo.gem;

import java.io.IOException;

import org.apache.maven.plugin.MojoExecutionException;

import de.saumya.mojo.ruby.script.ScriptException;

/**
 * goal to run gem with the given arguments.
 * 
 * @goal gem
 */
@Deprecated
public class GemMojo extends AbstractGemMojo {
    /**
     * arguments for the gem command of JRuby.
     * <br/>
     * Command line -Dgem.args=...
     * 
     * @parameter default-value="${gem.args}"
     */
    protected String gemArgs = null;

    @Override
    public void executeWithGems() throws MojoExecutionException,
            ScriptException, IOException {
        getLog().warn( "DEPRECATED: just do not use that anymore. use gem:exec instead" );
        this.factory.newScriptFromJRubyJar("gem")
                .addArgs(this.gemArgs)
                .addArgs(this.args)
                .execute();
    }
}
