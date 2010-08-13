/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gatATAC.poris.systems.MVC;

import java.util.ArrayList;

/**
 *
 * @author txinto
 */
public class Model extends BaseClass {

    private String name;
    private ArrayList<Observer> observers;
    private boolean notifyFlag=true;

    public Model(String name) {
        this.name = name;
        observers = new ArrayList();
    }

    public void setName(String name) {
        this.name = name;
        this.notifyObs();
    }

    public boolean isNotifyFlag() {
        return notifyFlag;
    }

    public void setNotifyFlag(boolean notifyFlag) {
        this.notifyFlag = notifyFlag;
    }
    
    public void attach(Observer obs) {
        observers.add(obs);
    }
    
    public void detach(Observer obs) {
        observers.remove(obs);
    }
    
    public void notifyObs() {
        if (isNotifyFlag()) {
            for (int i=0; i<observers.size();i++) {
                observers.get(i).update();
            }
        }
    }

    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    
    @Override
    public boolean equals(Object obj) {
        boolean ret=super.equals(obj);
        if (!ret) {
            if (obj.getClass()==String.class) {
                ret=this.toString()==obj;
            }
        }
        return ret;
    }

    @Override
    protected Object clone() {
        return this.clone(this.getName());
    }
    
    protected Object clone(String name) {
        //return super.clone();
        Model ret = null;
        ret=new Model(name);
        return (Object)ret;
    }
}
