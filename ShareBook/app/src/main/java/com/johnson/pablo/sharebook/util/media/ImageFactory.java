package com.johnson.pablo.sharebook.util.media;


import com.johnson.pablo.sharebook.util.media.loaders.GlideLoader;
import com.johnson.pablo.sharebook.util.media.loaders.ImageLoader;

/**
 * @author Carlos Piñan
 */
public class ImageFactory {

    public enum ImageProvider {
        GLIDE,
        PICASSO /*NOT IMPLEMENTED YET*/
    }

    private ImageFactory() { /* UNUSED */ }

    public static ImageLoader getLoader() {
        return getLoader(ImageProvider.GLIDE);
    }

    public static ImageLoader getLoader(ImageProvider imageProvider) {
        switch (imageProvider) {
            case GLIDE:
                return new GlideLoader();
            default:
                return new GlideLoader();
        }
    }
}