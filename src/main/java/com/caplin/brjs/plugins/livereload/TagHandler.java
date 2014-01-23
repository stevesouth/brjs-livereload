package com.caplin.brjs.plugins.livereload;

import org.bladerunnerjs.model.BRJS;
import org.bladerunnerjs.model.BundleSet;
import org.bladerunnerjs.plugin.base.AbstractTagHandlerPlugin;

import java.io.IOException;

/**
 * Created by dogoku on 23/01/2014.
 */
public class TagHandler extends AbstractTagHandlerPlugin {
    private BRJS brjs;

    @java.lang.Override
    public String getTagName() {
        return "live.reload";
    }

    @java.lang.Override
    public String getGroupName() {
        return null;
    }

    @java.lang.Override
    public void writeDevTagContent(java.util.Map<java.lang.String, java.lang.String> stringStringMap, BundleSet bundleSet, java.lang.String string, java.io.Writer writer) throws IOException {
        try {
            writer.write("<script>alert('LIVE RELOAD!!');</script>");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @java.lang.Override
    public void writeProdTagContent(java.util.Map<java.lang.String, java.lang.String> stringStringMap, BundleSet bundleSet, java.lang.String string, java.io.Writer writer) throws IOException {

    }

    @java.lang.Override
    public void setBRJS(BRJS brjs) {
        this.brjs = brjs;
    }
}
