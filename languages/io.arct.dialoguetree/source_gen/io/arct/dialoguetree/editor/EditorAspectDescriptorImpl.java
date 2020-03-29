package io.arct.dialoguetree.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.openapi.editor.descriptor.SubstituteMenu;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase {
  @NotNull
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    SAbstractConcept cncpt = ((SAbstractConcept) concept);
    switch (conceptIndex.index(cncpt)) {
      case 0:
        return Collections.<ConceptEditor>singletonList(new ActionSet_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new ActionSetReference_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new Dialogue_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new DialogueReference_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new DialogueTree_Editor());
      case 5:
        return Collections.<ConceptEditor>singletonList(new EntryDialogue_Editor());
      case 6:
        return Collections.<ConceptEditor>singletonList(new ExitAction_Editor());
      case 7:
        return Collections.<ConceptEditor>singletonList(new IfAction_Editor());
      case 8:
        return Collections.<ConceptEditor>singletonList(new Option_Editor());
      case 9:
        return Collections.<ConceptEditor>singletonList(new OptionsAction_Editor());
      case 10:
        return Collections.<ConceptEditor>singletonList(new Participant_Editor());
      case 11:
        return Collections.<ConceptEditor>singletonList(new ParticipantReference_Editor());
      case 12:
        return Collections.<ConceptEditor>singletonList(new Property_Editor());
      case 13:
        return Collections.<ConceptEditor>singletonList(new PropertyReference_Editor());
      case 14:
        return Collections.<ConceptEditor>singletonList(new RandomAction_Editor());
      case 15:
        return Collections.<ConceptEditor>singletonList(new ReturnAction_Editor());
      case 16:
        return Collections.<ConceptEditor>singletonList(new Text_Editor());
      case 17:
        return Collections.<ConceptEditor>singletonList(new ToActionSetAction_Editor());
      case 18:
        return Collections.<ConceptEditor>singletonList(new ToDialogueAction_Editor());
      case 19:
        return Collections.<ConceptEditor>singletonList(new ToEntryAction_Editor());
      default:
    }
    return Collections.<ConceptEditor>emptyList();
  }


  @NotNull
  @Override
  public Collection<SubstituteMenu> getDeclaredDefaultSubstituteMenus(SAbstractConcept concept) {
    SAbstractConcept cncpt = concept;
    switch (conceptIndex1.index(cncpt)) {
      case 0:
        return Collections.<SubstituteMenu>singletonList(new ActionSetReference_SubstituteMenu());
      case 1:
        return Collections.<SubstituteMenu>singletonList(new DialogueReference_SubstituteMenu());
      case 2:
        return Collections.<SubstituteMenu>singletonList(new ParticipantReference_SubstituteMenu());
      case 3:
        return Collections.<SubstituteMenu>singletonList(new PropertyReference_SubstituteMenu());
      default:
    }
    return Collections.<SubstituteMenu>emptyList();
  }

  private static final ConceptSwitchIndex conceptIndex = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7058b1644L), MetaIdFactory.conceptId(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7059b2ca7L), MetaIdFactory.conceptId(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056a71c4L), MetaIdFactory.conceptId(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7059b2c96L), MetaIdFactory.conceptId(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba705693edcL), MetaIdFactory.conceptId(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056be8d9L), MetaIdFactory.conceptId(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056d3f19L), MetaIdFactory.conceptId(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba705913a99L), MetaIdFactory.conceptId(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056d89ffL), MetaIdFactory.conceptId(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056d3efaL), MetaIdFactory.conceptId(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x812480f55445d42L), MetaIdFactory.conceptId(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x812480f55445d45L), MetaIdFactory.conceptId(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba70593b1ceL), MetaIdFactory.conceptId(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7059b2caaL), MetaIdFactory.conceptId(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x812480f5549560cL), MetaIdFactory.conceptId(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056e10b4L), MetaIdFactory.conceptId(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056ae042L), MetaIdFactory.conceptId(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7058bb408L), MetaIdFactory.conceptId(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056d3f16L), MetaIdFactory.conceptId(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056e824dL)).seal();
  private static final ConceptSwitchIndex conceptIndex1 = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7059b2ca7L), MetaIdFactory.conceptId(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7059b2c96L), MetaIdFactory.conceptId(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x812480f55445d45L), MetaIdFactory.conceptId(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7059b2caaL)).seal();
}
