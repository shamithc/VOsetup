package com.jocata.MPdemo.vo.investoronboarding.individual;

import com.jocata.MPdemo.vo.investoronboarding.common.Declarations;

import java.util.Arrays;
import java.util.StringJoiner;

public class IndividualDeclarations extends Declarations {
    private DeclarationDetails[] declarationDetails;
    private JointAccountDeclaration jointAccountDeclaration;

    public IndividualDeclarations() {
    }

    public DeclarationDetails[] getDeclarationDetails() {
        return declarationDetails;
    }

    public void setDeclarationDetails(DeclarationDetails[] declarationDetails) {
        this.declarationDetails = declarationDetails;
    }

    public JointAccountDeclaration getJointAccountDeclaration() {
        return jointAccountDeclaration;
    }

    public void setJointAccountDeclaration(JointAccountDeclaration jointAccountDeclaration) {
        this.jointAccountDeclaration = jointAccountDeclaration;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", IndividualDeclarations.class.getSimpleName() + "[", "]")
                .add("declarationDetails=" + Arrays.toString(declarationDetails))
                .add("jointAccountDeclaration=" + jointAccountDeclaration)
                .toString();
    }
}
