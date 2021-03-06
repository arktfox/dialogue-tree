package io.arct.dialoguetree.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import jetbrains.mps.smodel.runtime.DataTypeDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2;
import jetbrains.mps.smodel.adapter.ids.PrimitiveTypeId;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {
  /*package*/ final ConceptDescriptor myConceptAction = createDescriptorForAction();
  /*package*/ final ConceptDescriptor myConceptActionSet = createDescriptorForActionSet();
  /*package*/ final ConceptDescriptor myConceptActionSetReference = createDescriptorForActionSetReference();
  /*package*/ final ConceptDescriptor myConceptDialogue = createDescriptorForDialogue();
  /*package*/ final ConceptDescriptor myConceptDialogueReference = createDescriptorForDialogueReference();
  /*package*/ final ConceptDescriptor myConceptDialogueTree = createDescriptorForDialogueTree();
  /*package*/ final ConceptDescriptor myConceptEntryDialogue = createDescriptorForEntryDialogue();
  /*package*/ final ConceptDescriptor myConceptExitAction = createDescriptorForExitAction();
  /*package*/ final ConceptDescriptor myConceptIfAction = createDescriptorForIfAction();
  /*package*/ final ConceptDescriptor myConceptModifier = createDescriptorForModifier();
  /*package*/ final ConceptDescriptor myConceptModifierReference = createDescriptorForModifierReference();
  /*package*/ final ConceptDescriptor myConceptOption = createDescriptorForOption();
  /*package*/ final ConceptDescriptor myConceptOptionsAction = createDescriptorForOptionsAction();
  /*package*/ final ConceptDescriptor myConceptParticipant = createDescriptorForParticipant();
  /*package*/ final ConceptDescriptor myConceptParticipantReference = createDescriptorForParticipantReference();
  /*package*/ final ConceptDescriptor myConceptProperty = createDescriptorForProperty();
  /*package*/ final ConceptDescriptor myConceptPropertyReference = createDescriptorForPropertyReference();
  /*package*/ final ConceptDescriptor myConceptRandomAction = createDescriptorForRandomAction();
  /*package*/ final ConceptDescriptor myConceptReturnAction = createDescriptorForReturnAction();
  /*package*/ final ConceptDescriptor myConceptStructureDumper = createDescriptorForStructureDumper();
  /*package*/ final ConceptDescriptor myConceptText = createDescriptorForText();
  /*package*/ final ConceptDescriptor myConceptTextModifier = createDescriptorForTextModifier();
  /*package*/ final ConceptDescriptor myConceptToActionSetAction = createDescriptorForToActionSetAction();
  /*package*/ final ConceptDescriptor myConceptToDialogueAction = createDescriptorForToDialogueAction();
  /*package*/ final ConceptDescriptor myConceptToEntryAction = createDescriptorForToEntryAction();
  private final LanguageConceptSwitch myIndexSwitch;

  public StructureAspectDescriptor() {
    myIndexSwitch = new LanguageConceptSwitch();
  }


  @Override
  public void reportDependencies(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.Dependencies deps) {
    deps.extendedLanguage(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, "jetbrains.mps.lang.core");
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptAction, myConceptActionSet, myConceptActionSetReference, myConceptDialogue, myConceptDialogueReference, myConceptDialogueTree, myConceptEntryDialogue, myConceptExitAction, myConceptIfAction, myConceptModifier, myConceptModifierReference, myConceptOption, myConceptOptionsAction, myConceptParticipant, myConceptParticipantReference, myConceptProperty, myConceptPropertyReference, myConceptRandomAction, myConceptReturnAction, myConceptStructureDumper, myConceptText, myConceptTextModifier, myConceptToActionSetAction, myConceptToDialogueAction, myConceptToEntryAction);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myIndexSwitch.index(id)) {
      case LanguageConceptSwitch.Action:
        return myConceptAction;
      case LanguageConceptSwitch.ActionSet:
        return myConceptActionSet;
      case LanguageConceptSwitch.ActionSetReference:
        return myConceptActionSetReference;
      case LanguageConceptSwitch.Dialogue:
        return myConceptDialogue;
      case LanguageConceptSwitch.DialogueReference:
        return myConceptDialogueReference;
      case LanguageConceptSwitch.DialogueTree:
        return myConceptDialogueTree;
      case LanguageConceptSwitch.EntryDialogue:
        return myConceptEntryDialogue;
      case LanguageConceptSwitch.ExitAction:
        return myConceptExitAction;
      case LanguageConceptSwitch.IfAction:
        return myConceptIfAction;
      case LanguageConceptSwitch.Modifier:
        return myConceptModifier;
      case LanguageConceptSwitch.ModifierReference:
        return myConceptModifierReference;
      case LanguageConceptSwitch.Option:
        return myConceptOption;
      case LanguageConceptSwitch.OptionsAction:
        return myConceptOptionsAction;
      case LanguageConceptSwitch.Participant:
        return myConceptParticipant;
      case LanguageConceptSwitch.ParticipantReference:
        return myConceptParticipantReference;
      case LanguageConceptSwitch.Property:
        return myConceptProperty;
      case LanguageConceptSwitch.PropertyReference:
        return myConceptPropertyReference;
      case LanguageConceptSwitch.RandomAction:
        return myConceptRandomAction;
      case LanguageConceptSwitch.ReturnAction:
        return myConceptReturnAction;
      case LanguageConceptSwitch.StructureDumper:
        return myConceptStructureDumper;
      case LanguageConceptSwitch.Text:
        return myConceptText;
      case LanguageConceptSwitch.TextModifier:
        return myConceptTextModifier;
      case LanguageConceptSwitch.ToActionSetAction:
        return myConceptToActionSetAction;
      case LanguageConceptSwitch.ToDialogueAction:
        return myConceptToDialogueAction;
      case LanguageConceptSwitch.ToEntryAction:
        return myConceptToEntryAction;
      default:
        return null;
    }
  }

  @Override
  public Collection<DataTypeDescriptor> getDataTypeDescriptors() {
    return Arrays.asList();
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    return myIndexSwitch.index(c);
  }

  private static ConceptDescriptor createDescriptorForAction() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("io.arct.dialoguetree", "Action", 0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056d3ef7L);
    b.class_(false, true, false);
    b.origin("r:3b423fe3-f0e6-4131-bf0a-a0d7d72673f2(io.arct.dialoguetree.structure)/6264854145185693431");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForActionSet() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("io.arct.dialoguetree", "ActionSet", 0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7058b1644L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:3b423fe3-f0e6-4131-bf0a-a0d7d72673f2(io.arct.dialoguetree.structure)/6264854145187649092");
    b.version(2);
    b.aggregate("action", 0x56f13ba7058b1645L).target(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056d3ef7L).optional(false).ordered(true).multiple(false).origin("6264854145187649093").done();
    b.alias("action");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForActionSetReference() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("io.arct.dialoguetree", "ActionSetReference", 0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7059b2ca7L);
    b.class_(false, false, false);
    b.origin("r:3b423fe3-f0e6-4131-bf0a-a0d7d72673f2(io.arct.dialoguetree.structure)/6264854145188703399");
    b.version(2);
    b.associate("actions", 0x56f13ba7059b2ca8L).target(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7058b1644L).optional(false).origin("6264854145188703400").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDialogue() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("io.arct.dialoguetree", "Dialogue", 0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056a71c4L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:3b423fe3-f0e6-4131-bf0a-a0d7d72673f2(io.arct.dialoguetree.structure)/6264854145185509828");
    b.version(2);
    b.aggregate("text", 0x56f13ba7056af9e9L).target(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056ae042L).optional(false).ordered(true).multiple(true).origin("6264854145185544681").done();
    b.aggregate("action", 0x56f13ba7056d3f63L).target(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056d3ef7L).optional(false).ordered(true).multiple(false).origin("6264854145185693539").done();
    b.alias("dialogue");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDialogueReference() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("io.arct.dialoguetree", "DialogueReference", 0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7059b2c96L);
    b.class_(false, false, false);
    b.origin("r:3b423fe3-f0e6-4131-bf0a-a0d7d72673f2(io.arct.dialoguetree.structure)/6264854145188703382");
    b.version(2);
    b.associate("dialogue", 0x56f13ba7059b2c97L).target(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056a71c4L).optional(false).origin("6264854145188703383").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDialogueTree() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("io.arct.dialoguetree", "DialogueTree", 0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba705693edcL);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x33d23ee961a0cbf3L);
    b.origin("r:3b423fe3-f0e6-4131-bf0a-a0d7d72673f2(io.arct.dialoguetree.structure)/6264854145185431260");
    b.version(2);
    b.aggregate("participants", 0x812480f554473b9L).target(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x812480f55445d42L).optional(false).ordered(true).multiple(true).origin("581606532576474041").done();
    b.aggregate("modifiers", 0x823c998d80e3d49L).target(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x823c998d80d4483L).optional(true).ordered(true).multiple(true).origin("586534034785320265").done();
    b.aggregate("properties", 0x56f13ba70596d037L).target(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba70593b1ceL).optional(true).ordered(true).multiple(true).origin("6264854145188417591").done();
    b.aggregate("entry", 0x56f13ba7056c8904L).target(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056be8d9L).optional(false).ordered(true).multiple(false).origin("6264854145185646852").done();
    b.aggregate("dialogues", 0x56f13ba7056a845bL).target(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056a71c4L).optional(true).ordered(true).multiple(true).origin("6264854145185514587").done();
    b.aggregate("actions", 0x56f13ba7058b1640L).target(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7058b1644L).optional(true).ordered(true).multiple(true).origin("6264854145187649088").done();
    b.alias("dialogue tree");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForEntryDialogue() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("io.arct.dialoguetree", "EntryDialogue", 0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056be8d9L);
    b.class_(false, false, false);
    b.super_("io.arct.dialoguetree.structure.Dialogue", 0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056a71c4L);
    b.origin("r:3b423fe3-f0e6-4131-bf0a-a0d7d72673f2(io.arct.dialoguetree.structure)/6264854145185605849");
    b.version(2);
    b.alias("entry dialogue");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForExitAction() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("io.arct.dialoguetree", "ExitAction", 0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056d3f19L);
    b.class_(false, false, false);
    b.super_("io.arct.dialoguetree.structure.Action", 0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056d3ef7L);
    b.origin("r:3b423fe3-f0e6-4131-bf0a-a0d7d72673f2(io.arct.dialoguetree.structure)/6264854145185693465");
    b.version(2);
    b.alias("end dialogue");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForIfAction() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("io.arct.dialoguetree", "IfAction", 0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba705913a99L);
    b.class_(false, false, false);
    b.super_("io.arct.dialoguetree.structure.Action", 0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056d3ef7L);
    b.origin("r:3b423fe3-f0e6-4131-bf0a-a0d7d72673f2(io.arct.dialoguetree.structure)/6264854145188051609");
    b.version(2);
    b.property("value", 0x56f13ba70598d2e2L).type(PrimitiveTypeId.STRING).origin("6264854145188549346").done();
    b.aggregate("property", 0x56f13ba7059b2ce7L).target(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7059b2caaL).optional(false).ordered(true).multiple(false).origin("6264854145188703463").done();
    b.aggregate("action", 0x56f13ba705913a9aL).target(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056d3ef7L).optional(false).ordered(true).multiple(false).origin("6264854145188051610").done();
    b.aggregate("elseAction", 0x56f13ba70592f2e9L).target(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056d3ef7L).optional(false).ordered(true).multiple(false).origin("6264854145188164329").done();
    b.alias("if");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForModifier() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("io.arct.dialoguetree", "Modifier", 0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x823c998d80d4483L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:3b423fe3-f0e6-4131-bf0a-a0d7d72673f2(io.arct.dialoguetree.structure)/586534034785256579");
    b.version(2);
    b.alias("modifier");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForModifierReference() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("io.arct.dialoguetree", "ModifierReference", 0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x823c998d80d4484L);
    b.class_(false, false, false);
    b.origin("r:3b423fe3-f0e6-4131-bf0a-a0d7d72673f2(io.arct.dialoguetree.structure)/586534034785256580");
    b.version(2);
    b.associate("modifier", 0x823c998d80d4485L).target(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x823c998d80d4483L).optional(false).origin("586534034785256581").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForOption() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("io.arct.dialoguetree", "Option", 0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056d89ffL);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:3b423fe3-f0e6-4131-bf0a-a0d7d72673f2(io.arct.dialoguetree.structure)/6264854145185712639");
    b.version(2);
    b.aggregate("action", 0x56f13ba7056e10d2L).target(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056d3ef7L).optional(false).ordered(true).multiple(false).origin("6264854145185747154").done();
    b.alias("option");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForOptionsAction() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("io.arct.dialoguetree", "OptionsAction", 0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056d3efaL);
    b.class_(false, false, false);
    b.super_("io.arct.dialoguetree.structure.Action", 0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056d3ef7L);
    b.origin("r:3b423fe3-f0e6-4131-bf0a-a0d7d72673f2(io.arct.dialoguetree.structure)/6264854145185693434");
    b.version(2);
    b.aggregate("options", 0x56f13ba7056d8a02L).target(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056d89ffL).optional(false).ordered(true).multiple(true).origin("6264854145185712642").done();
    b.alias("actions");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForParticipant() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("io.arct.dialoguetree", "Participant", 0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x812480f55445d42L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:3b423fe3-f0e6-4131-bf0a-a0d7d72673f2(io.arct.dialoguetree.structure)/581606532576468290");
    b.version(2);
    b.alias("participant");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForParticipantReference() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("io.arct.dialoguetree", "ParticipantReference", 0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x812480f55445d45L);
    b.class_(false, false, false);
    b.origin("r:3b423fe3-f0e6-4131-bf0a-a0d7d72673f2(io.arct.dialoguetree.structure)/581606532576468293");
    b.version(2);
    b.associate("participant", 0x812480f55445d46L).target(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x812480f55445d42L).optional(false).origin("581606532576468294").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForProperty() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("io.arct.dialoguetree", "Property", 0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba70593b1ceL);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:3b423fe3-f0e6-4131-bf0a-a0d7d72673f2(io.arct.dialoguetree.structure)/6264854145188213198");
    b.version(2);
    b.alias("property");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForPropertyReference() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("io.arct.dialoguetree", "PropertyReference", 0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7059b2caaL);
    b.class_(false, false, false);
    b.origin("r:3b423fe3-f0e6-4131-bf0a-a0d7d72673f2(io.arct.dialoguetree.structure)/6264854145188703402");
    b.version(2);
    b.associate("property", 0x56f13ba7059b2cabL).target(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba70593b1ceL).optional(false).origin("6264854145188703403").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForRandomAction() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("io.arct.dialoguetree", "RandomAction", 0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x812480f5549560cL);
    b.class_(false, false, false);
    b.super_("io.arct.dialoguetree.structure.Action", 0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056d3ef7L);
    b.origin("r:3b423fe3-f0e6-4131-bf0a-a0d7d72673f2(io.arct.dialoguetree.structure)/581606532576794124");
    b.version(2);
    b.aggregate("actions", 0x812480f55495637L).target(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056d3ef7L).optional(false).ordered(true).multiple(true).origin("581606532576794167").done();
    b.alias("random");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForReturnAction() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("io.arct.dialoguetree", "ReturnAction", 0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056e10b4L);
    b.class_(false, false, false);
    b.super_("io.arct.dialoguetree.structure.Action", 0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056d3ef7L);
    b.origin("r:3b423fe3-f0e6-4131-bf0a-a0d7d72673f2(io.arct.dialoguetree.structure)/6264854145185747124");
    b.version(2);
    b.property("value", 0x56f13ba7056e10b5L).type(PrimitiveTypeId.STRING).origin("6264854145185747125").done();
    b.alias("return");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForStructureDumper() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("io.arct.dialoguetree", "StructureDumper", 0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056fbc86L);
    b.class_(false, false, false);
    b.origin("r:3b423fe3-f0e6-4131-bf0a-a0d7d72673f2(io.arct.dialoguetree.structure)/6264854145185856646");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForText() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("io.arct.dialoguetree", "Text", 0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056ae042L);
    b.class_(false, false, false);
    b.origin("r:3b423fe3-f0e6-4131-bf0a-a0d7d72673f2(io.arct.dialoguetree.structure)/6264854145185538114");
    b.version(2);
    b.property("text", 0x56f13ba7056ae043L).type(PrimitiveTypeId.STRING).origin("6264854145185538115").done();
    b.aggregate("speaker", 0x812480f554add6cL).target(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x812480f55445d45L).optional(false).ordered(true).multiple(false).origin("581606532576894316").done();
    b.alias("text");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForTextModifier() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("io.arct.dialoguetree", "TextModifier", 0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x823c998d80bca69L);
    b.class_(false, false, false);
    b.super_("jetbrains.mps.lang.core.structure.NodeAttribute", 0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x2eb1ad060897da54L);
    b.origin("r:3b423fe3-f0e6-4131-bf0a-a0d7d72673f2(io.arct.dialoguetree.structure)/586534034785159785");
    b.version(2);
    b.aggregate("modifier", 0x823c998d80e3da3L).target(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x823c998d80d4484L).optional(false).ordered(true).multiple(false).origin("586534034785320355").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForToActionSetAction() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("io.arct.dialoguetree", "ToActionSetAction", 0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7058bb408L);
    b.class_(false, false, false);
    b.super_("io.arct.dialoguetree.structure.Action", 0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056d3ef7L);
    b.origin("r:3b423fe3-f0e6-4131-bf0a-a0d7d72673f2(io.arct.dialoguetree.structure)/6264854145187689480");
    b.version(2);
    b.aggregate("action", 0x56f13ba7059b2cefL).target(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7059b2ca7L).optional(false).ordered(true).multiple(false).origin("6264854145188703471").done();
    b.alias("to action");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForToDialogueAction() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("io.arct.dialoguetree", "ToDialogueAction", 0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056d3f16L);
    b.class_(false, false, false);
    b.super_("io.arct.dialoguetree.structure.Action", 0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056d3ef7L);
    b.origin("r:3b423fe3-f0e6-4131-bf0a-a0d7d72673f2(io.arct.dialoguetree.structure)/6264854145185693462");
    b.version(2);
    b.aggregate("dialogue", 0x56f13ba7059b2cf3L).target(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7059b2c96L).optional(false).ordered(true).multiple(false).origin("6264854145188703475").done();
    b.alias("to dialogue");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForToEntryAction() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("io.arct.dialoguetree", "ToEntryAction", 0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056e824dL);
    b.class_(false, false, false);
    b.super_("io.arct.dialoguetree.structure.Action", 0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056d3ef7L);
    b.origin("r:3b423fe3-f0e6-4131-bf0a-a0d7d72673f2(io.arct.dialoguetree.structure)/6264854145185776205");
    b.version(2);
    b.alias("to entry");
    return b.create();
  }
}
