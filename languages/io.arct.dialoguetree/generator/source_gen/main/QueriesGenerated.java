package main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.generator.impl.query.QueryProviderBase;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.generator.template.MapSrcMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import io.arct.dialoguetree.behavior.StructureDumper__BehaviorDescriptor;
import java.util.Map;
import jetbrains.mps.generator.impl.query.PropertyValueQuery;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.impl.query.QueryKey;
import org.jetbrains.mps.openapi.language.SProperty;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.generator.impl.GenerationFailureException;
import jetbrains.mps.generator.impl.query.MapNodeQuery;

@Generated
public class QueriesGenerated extends QueryProviderBase {
  public QueriesGenerated() {
    super(1);
  }
  public static Object propertyMacro_GetValue_1_0(final PropertyMacroContext _context) {
    String name = SPropertyOperations.getString(_context.getNode(), PROPS.name$tAp1).replaceAll("\\s", "-").toLowerCase();

    return "dialogue-" + name;
  }
  public static SNode mapSrcMacro_map_1_0(final MapSrcMacroContext _context) {
    SNode root = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x5c842a42c54b10b2L, "jetbrains.mps.core.xml.structure.XmlElement"));
    SNode dumper = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x200ef616249d4ed7L, 0x9810cbdeaf100067L, 0x56f13ba7056fbc86L, "io.arct.dialoguetree.structure.StructureDumper"));

    SPropertyOperations.assign(root, PROPS.tagName$U00C, "document");

    StructureDumper__BehaviorDescriptor.dumpStructure_id5rLeUs5rVMi.invoke(dumper, _context.getNode(), root);
    return root;
  }
  private final Map<String, PropertyValueQuery> pvqMethods = new HashMap<String, PropertyValueQuery>();
  {
    int i = 0;
    pvqMethods.put("7776513967991511139", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "xml"));
  }
  @NotNull
  @Override
  public PropertyValueQuery getPropertyValueQuery(@NotNull QueryKey identity) {
    final String id = identity.getTemplateNode().getNodeId().toString();
    if (!(pvqMethods.containsKey(id))) {
      return super.getPropertyValueQuery(identity);
    }
    return pvqMethods.get(id);
  }
  private static class PVQ extends PropertyValueQuery.Base {
    private final int methodKey;
    /*package*/ PVQ(int methodKey, SProperty property, String templateValue) {
      super(property, templateValue);
      this.methodKey = methodKey;
    }
    @Nullable
    public Object evaluate(@NotNull PropertyMacroContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return QueriesGenerated.propertyMacro_GetValue_1_0(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, MapNodeQuery> mnqMethods = new HashMap<String, MapNodeQuery>();
  {
    mnqMethods.put("6264854145185835149", new MNQ(0));
  }
  @NotNull
  @Override
  public MapNodeQuery getMapNodeQuery(@NotNull QueryKey queryKey) {
    final String id = queryKey.getTemplateNode().getNodeId().toString();
    if (!(mnqMethods.containsKey(id))) {
      return super.getMapNodeQuery(queryKey);
    }
    return mnqMethods.get(id);
  }
  private static class MNQ implements MapNodeQuery {
    private final int methodKey;
    /*package*/ MNQ(int methodKey) {
      this.methodKey = methodKey;
    }
    @Nullable
    public SNode evaluate(@NotNull MapSrcMacroContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return QueriesGenerated.mapSrcMacro_map_1_0(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }

  private static final class PROPS {
    /*package*/ static final SProperty name$tAp1 = MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name");
    /*package*/ static final SProperty tagName$U00C = MetaAdapterFactory.getProperty(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x5c842a42c54b10b2L, 0x5c842a42c54b10b6L, "tagName");
  }
}
