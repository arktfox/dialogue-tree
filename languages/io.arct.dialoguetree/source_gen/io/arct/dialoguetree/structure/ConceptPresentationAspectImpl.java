package io.arct.dialoguetree.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_Action;
  private ConceptPresentation props_ActionSet;
  private ConceptPresentation props_ActionSetReference;
  private ConceptPresentation props_Dialogue;
  private ConceptPresentation props_DialogueReference;
  private ConceptPresentation props_DialogueTree;
  private ConceptPresentation props_EntryDialogue;
  private ConceptPresentation props_ExitAction;
  private ConceptPresentation props_IfAction;
  private ConceptPresentation props_Option;
  private ConceptPresentation props_OptionsAction;
  private ConceptPresentation props_Participant;
  private ConceptPresentation props_ParticipantReference;
  private ConceptPresentation props_Property;
  private ConceptPresentation props_PropertyReference;
  private ConceptPresentation props_RandomAction;
  private ConceptPresentation props_ReturnAction;
  private ConceptPresentation props_StructureDumper;
  private ConceptPresentation props_Text;
  private ConceptPresentation props_ToActionSetAction;
  private ConceptPresentation props_ToDialogueAction;
  private ConceptPresentation props_ToEntryAction;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.Action:
        if (props_Action == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_Action = cpb.create();
        }
        return props_Action;
      case LanguageConceptSwitch.ActionSet:
        if (props_ActionSet == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_ActionSet = cpb.create();
        }
        return props_ActionSet;
      case LanguageConceptSwitch.ActionSetReference:
        if (props_ActionSetReference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7059b2ca7L, 0x56f13ba7059b2ca8L, "actions", "", "");
          props_ActionSetReference = cpb.create();
        }
        return props_ActionSetReference;
      case LanguageConceptSwitch.Dialogue:
        if (props_Dialogue == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Dialogue = cpb.create();
        }
        return props_Dialogue;
      case LanguageConceptSwitch.DialogueReference:
        if (props_DialogueReference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7059b2c96L, 0x56f13ba7059b2c97L, "dialogue", "", "");
          props_DialogueReference = cpb.create();
        }
        return props_DialogueReference;
      case LanguageConceptSwitch.DialogueTree:
        if (props_DialogueTree == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_DialogueTree = cpb.create();
        }
        return props_DialogueTree;
      case LanguageConceptSwitch.EntryDialogue:
        if (props_EntryDialogue == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_EntryDialogue = cpb.create();
        }
        return props_EntryDialogue;
      case LanguageConceptSwitch.ExitAction:
        if (props_ExitAction == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("end dialogue");
          props_ExitAction = cpb.create();
        }
        return props_ExitAction;
      case LanguageConceptSwitch.IfAction:
        if (props_IfAction == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("if");
          props_IfAction = cpb.create();
        }
        return props_IfAction;
      case LanguageConceptSwitch.Option:
        if (props_Option == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Option = cpb.create();
        }
        return props_Option;
      case LanguageConceptSwitch.OptionsAction:
        if (props_OptionsAction == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("actions");
          props_OptionsAction = cpb.create();
        }
        return props_OptionsAction;
      case LanguageConceptSwitch.Participant:
        if (props_Participant == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Participant = cpb.create();
        }
        return props_Participant;
      case LanguageConceptSwitch.ParticipantReference:
        if (props_ParticipantReference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x812480f55445d45L, 0x812480f55445d46L, "participant", "", "");
          props_ParticipantReference = cpb.create();
        }
        return props_ParticipantReference;
      case LanguageConceptSwitch.Property:
        if (props_Property == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Property = cpb.create();
        }
        return props_Property;
      case LanguageConceptSwitch.PropertyReference:
        if (props_PropertyReference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7059b2caaL, 0x56f13ba7059b2cabL, "property", "", "");
          props_PropertyReference = cpb.create();
        }
        return props_PropertyReference;
      case LanguageConceptSwitch.RandomAction:
        if (props_RandomAction == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("random");
          props_RandomAction = cpb.create();
        }
        return props_RandomAction;
      case LanguageConceptSwitch.ReturnAction:
        if (props_ReturnAction == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("return");
          props_ReturnAction = cpb.create();
        }
        return props_ReturnAction;
      case LanguageConceptSwitch.StructureDumper:
        if (props_StructureDumper == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("StructureDumper");
          props_StructureDumper = cpb.create();
        }
        return props_StructureDumper;
      case LanguageConceptSwitch.Text:
        if (props_Text == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("text");
          props_Text = cpb.create();
        }
        return props_Text;
      case LanguageConceptSwitch.ToActionSetAction:
        if (props_ToActionSetAction == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("to action");
          props_ToActionSetAction = cpb.create();
        }
        return props_ToActionSetAction;
      case LanguageConceptSwitch.ToDialogueAction:
        if (props_ToDialogueAction == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("to dialogue");
          props_ToDialogueAction = cpb.create();
        }
        return props_ToDialogueAction;
      case LanguageConceptSwitch.ToEntryAction:
        if (props_ToEntryAction == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("to entry");
          props_ToEntryAction = cpb.create();
        }
        return props_ToEntryAction;
    }
    return null;
  }
}
