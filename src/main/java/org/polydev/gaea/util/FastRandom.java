package org.polydev.gaea.util;

import org.apache.commons.rng.core.source64.XoRoShiRo128PlusPlus;

import java.util.Random;
import java.util.SplittableRandom;

public class FastRandom extends Random {

    private XoRoShiRo128PlusPlus random;

    public FastRandom() {
        super();
        SplittableRandom randomseed = new SplittableRandom();
        this.random = new XoRoShiRo128PlusPlus(randomseed.nextLong(), randomseed.nextLong());
    }

    public FastRandom(long seed) {
        super(seed);
        SplittableRandom randomseed = new SplittableRandom(seed);
        this.random = new XoRoShiRo128PlusPlus(randomseed.nextLong(), randomseed.nextLong());
    }
    
    @Override
    public boolean nextBoolean() {
        return random.nextBoolean();
    }

    @Override
    public int nextInt() {
        return random.nextInt();
    }

    @Override
    public float nextFloat() {
        return (float) random.nextDouble();
    }

    @Override
    public double nextDouble() {
        return random.nextDouble();
    }

    @Override
    public synchronized void setSeed(long seed) {
        SplittableRandom randomseed = new SplittableRandom(seed);
        this.random = new XoRoShiRo128PlusPlus(randomseed.nextLong(), randomseed.nextLong());
    }

    @Override
    public void nextBytes(byte[] bytes) {
        random.nextBytes(bytes);
    }

    @Override
    public int nextInt(int bound) {
        return random.nextInt(bound);
    }

    @Override
    public long nextLong() {
        return random.nextLong();
    }
}