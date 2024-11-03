package io.codeforall.fanstatics.Abilities;
import io.codeforall.fanstatics.heroes.Hero;

public interface Ability {
    void use(Hero caster, Hero target);
}
