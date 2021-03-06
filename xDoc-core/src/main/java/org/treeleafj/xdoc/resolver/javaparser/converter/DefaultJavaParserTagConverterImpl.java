package org.treeleafj.xdoc.resolver.javaparser.converter;

import org.treeleafj.xdoc.tag.DocTag;
import org.treeleafj.xdoc.tag.DocTagImpl;
import org.treeleafj.xdoc.utils.CommentUtils;

/**
 * Created by leaf on 2017/3/4.
 */
public class DefaultJavaParserTagConverterImpl implements JavaParserTagConverter<String> {

    @Override
    public DocTag converter(String o) {
        String tagType = CommentUtils.findTagType(o);
        String coment = o.substring(tagType.length()).trim();
        return new DocTagImpl(tagType, coment);
    }
}
