/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

import java.util.List;

/**
 *
 * @author kiplagat
 */
public class AtLeastOne implements Criterion {

    private Criterion[] criterions;

    public AtLeastOne(Criterion... criterion) {
        this.criterions = criterion;
    }

    @Override
    public boolean complies(String line) {
        for (Criterion c : this.criterions) {
            if (c.complies(line)) {
                return true;
            }
        }
        return false;
    }

}
