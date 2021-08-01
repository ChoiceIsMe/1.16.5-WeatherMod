package io.github.choiceisme.client.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import io.github.choiceisme.common.entity.ExampleEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class ExampleEntityModel<T extends ExampleEntity> extends EntityModel<T> {
	private final ModelRenderer bb_main;

	public ExampleEntityModel() {
		texWidth = 64;
		texHeight = 64;

		bb_main = new ModelRenderer(this);
		bb_main.setPos(0.0F, 24.0F, 0.0F);
		bb_main.setTexSize(0, 0).addBox(-6.0F, -12.0F, -7.0F, 11.0F, 12.0F, 13.0F, 0.0F, false);
	}
	
	
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}

	@Override
	public void setupAnim(T p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_,
			float p_225597_6_) {

		
	}

	@Override
	public void renderToBuffer(MatrixStack p_225598_1_, IVertexBuilder p_225598_2_, int p_225598_3_, int p_225598_4_,
			float p_225598_5_, float p_225598_6_, float p_225598_7_, float p_225598_8_) {
		
	}
}