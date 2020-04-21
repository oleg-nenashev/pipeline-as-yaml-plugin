package org.jenkinsci.plugins.workflow.multibranch.yaml.pipeline.interfaces;

import com.amihaiemil.eoyaml.YamlMapping;
import com.amihaiemil.eoyaml.YamlNode;
import com.amihaiemil.eoyaml.YamlSequence;

public interface ParsableModelInterface {

    String toGroovy();

}