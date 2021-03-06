package org.polydev.gaea.tree;

import org.bukkit.Location;
import org.polydev.gaea.tree.fractal.FractalTree;
import org.polydev.gaea.tree.fractal.TreeGetter;
import org.polydev.gaea.tree.fractal.trees.*;

import java.util.Random;

public enum CustomTreeType implements TreeGetter {
    SHATTERED_SMALL {
        @Override
        public FractalTree getTree(Location l, Random r) {
            return new SmallShatteredTree(l, r);
        }
    },
    SHATTERED_LARGE {
        @Override
        public FractalTree getTree(Location l, Random r) {
            return new ShatteredTree(l, r);
        }
    },
    GIANT_OAK {
        @Override
        public FractalTree getTree(Location l, Random r) {
            return new OakTree(l, r);
        }
    },
    GIANT_SPRUCE {
        @Override
        public FractalTree getTree(Location l, Random r) {
            return new SpruceTree(l, r);
        }
    },
    SMALL_SHATTERED_PILLAR {
        @Override
        public FractalTree getTree(Location l, Random r) {
            return new SmallShatteredPillar(l, r);
        }
    },
    LARGE_SHATTERED_PILLAR {
        @Override
        public FractalTree getTree(Location l, Random r) {
            return new ShatteredPillar(l, r);
        }
    },
    CACTUS {
        @Override
        public FractalTree getTree(Location l, Random r) {
            return new Cactus(l, r);
        }
    },
    ICE_SPIKE {
        @Override
        public FractalTree getTree(Location l, Random r) {
            return new IceSpike(l, r);
        }
    }
}
