import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int maxHealth = health;
        int currentHealth = health;
        int lastAttackTime = 0;
        
        int castingTime = bandage[0];
        int recoverPerSec = bandage[1];
        int bonusRecover = bandage[2];

        for (int[] attack : attacks) {
            int attackTime = attack[0];
            int damage = attack[1];
            
            int timeDiff = attackTime - lastAttackTime - 1;
            
            if (timeDiff > 0) {
                currentHealth += timeDiff * recoverPerSec;
                currentHealth += (timeDiff / castingTime) * bonusRecover;
                
                if (currentHealth > maxHealth) currentHealth = maxHealth;
            }
            
            currentHealth -= damage;
            lastAttackTime = attackTime;
            
            if (currentHealth <= 0) return -1;
        }

        return currentHealth;
    }
}