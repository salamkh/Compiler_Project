package com.company.SymbolTable;

import java.util.ArrayList;
import java.util.Stack;

public class SymbolTable {

    private ArrayList<Scope> scopes = new ArrayList<Scope>();

    private Stack<Scope> scopeStack = new Stack<Scope>();

    public Scope getScopeByID(int id) {
        for (Scope scope : scopes) {
            if (scope.getId() == id) {
                return scope;
            }
        }
        return null;
    }

    public ArrayList<Scope> getScopes() {
        return scopes;
    }

    public void setScopes(ArrayList<Scope> scopes) {
        this.scopes = scopes;
    }

    public Stack<Scope> getScopeStack() {
        return scopeStack;
    }

    public void setScopeStack(Stack<Scope> scopeStack) {
        this.scopeStack = scopeStack;
    }

    public void moveSymbolScope(int fromID, int toID, String symbol) {
        Scope fromScope = scopes.get(fromID - 1);
        Scope toScope = scopes.get(toID - 1);
        Symbol moveSymbol = fromScope.removeSymbol(symbol);
        moveSymbol.setScope(toScope);
        toScope.addSymbol(moveSymbol);
    }

    public Scope searchForSymbol(String symbol) {
        for (Scope current : scopes) {
            if (current.searchForSymbol(symbol) != null)
                return current;
        }
        return null;
    }

}
