package org.lyc.platform.sys.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.*;

@Table(name = "sys_user")
public class User implements Serializable
{
    private static final long serialVersionUID = -5491465745150176562L;
    @Id
    @Column
    private String            user_id;
    @Column
    private String            domain_id;
    @Column
    private String            domain_name;
    @Column
    private Date              vail_date;
    @Column
    private Integer           is_del;
    @Column
    private Integer           status;
    @Column
    private String            photo_url;
    @Column
    private String            user_code;
    @Column
    private String            user_pwd;
    @Column
    private String            old_pwd;
    @Column
    private Integer           user_type;
    @Column
    private Integer           is_active;
    @Column
    private String            pass_question;
    @Column
    private String            pass_answer;
    @Column
    private String            user_name;
    @Column
    private String            info;
    @Column
    private String            introduct;
    @Transient
    private String            resume;
    @Transient
    private Map               detail           = new HashMap();
    @Column
    private String            dept_id;
    @Transient
    private String            user_types;
    @Transient
    private String            dept_name;
    @Transient
    private String            entrust_user_id;
    @Transient
    private String            entrust_dept_id;
    @Column
    private String            pos_id;
    @Transient
    private String            input_id;
    @Transient
    private String            input_name;
    @Transient
    private List              entrust_list     = new ArrayList();
    @Transient
    private String            ip;
    @Column
    private Date              create_date;
    @Transient
    private String            ent_prop_cn;
    @Transient
    private String            types[];
    @Transient
    private String            user_codes[];
    @Transient
    private String            vali_code;
    @Column
    private String            telephone;
    @Transient
    private String            session_id;
    @Transient
    private String            client;
    @Transient
    private String            pos_name;
    @Column
    private String            user_pwd_md5;
    @Transient
    private String pos_lv;
    @Transient
    private String pos_lv_cn;

    public String[] getUser_codes()
    {
        return user_codes;
    }

    public void setUser_codes(String[] user_codes)
    {
        this.user_codes = user_codes;
    }

    public String[] getTypes()
    {
        return types;
    }

    public void setTypes(String[] types)
    {
        this.types = types;
    }

    public String getEnt_prop_cn()
    {
        return ent_prop_cn;
    }

    public void setEnt_prop_cn(String ent_prop_cn)
    {
        this.ent_prop_cn = ent_prop_cn;
    }

    public String getEnt_sub_prop_cn()
    {
        return ent_sub_prop_cn;
    }

    public void setEnt_sub_prop_cn(String ent_sub_prop_cn)
    {
        this.ent_sub_prop_cn = ent_sub_prop_cn;
    }

    public static long getSerialversionuid()
    {
        return serialVersionUID;
    }
    @Transient
    private String ent_sub_prop_cn;

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
    @Transient
    private String salt;

    public User()
    {

    }

    public String getUser_id()
    {
        return user_id;
    }

    public void setUser_id(String user_id)
    {
        this.user_id = user_id;
    }

    public String getDomain_id()
    {
        return domain_id;
    }

    public void setDomain_id(String domain_id)
    {
        this.domain_id = domain_id;
    }

    public Date getVail_date()
    {
        return vail_date;
    }

    public void setVail_date(Date vail_date)
    {
        this.vail_date = vail_date;
    }

    public Integer getDel_flag()
    {
        return is_del;
    }

    public void setDel_flag(Integer del_flag)
    {
        this.is_del = del_flag;
    }

    public Integer getStatus_flag()
    {
        return status;
    }

    public void setStatus_flag(Integer status_flag)
    {
        this.status = status_flag;
    }

    public String getPhoto_url()
    {
        return photo_url;
    }

    public void setPhoto_url(String photo_url)
    {
        this.photo_url = photo_url;
    }

    public String getUser_code()
    {
        return user_code;
    }

    public void setUser_code(String user_code)
    {
        this.user_code = user_code;
    }

    public String getUser_pwd()
    {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd)
    {
        this.user_pwd = user_pwd;
    }

    public Integer getUser_type()
    {
        return user_type;
    }

    public void setUser_type(Integer user_type)
    {
        this.user_type = user_type;
    }

    public Integer getIs_active()
    {
        return is_active;
    }

    public void setIs_active(Integer is_active)
    {
        this.is_active = is_active;
    }

    public String getPass_question()
    {
        return pass_question;
    }

    public void setPass_question(String pass_question)
    {
        this.pass_question = pass_question;
    }

    public String getPass_answer()
    {
        return pass_answer;
    }

    public void setPass_answer(String pass_answer)
    {
        this.pass_answer = pass_answer;
    }

    public String getUser_name()
    {
        return user_name;
    }

    public void setUser_name(String user_name)
    {
        this.user_name = user_name;
    }

    public String getInfo()
    {
        return info;
    }

    public void setInfo(String info)
    {
        this.info = info;
    }

    public String getIntroduct()
    {
        return introduct;
    }

    public void setIntroduct(String introduct)
    {
        this.introduct = introduct;
    }

    public String getResume()
    {
        return resume;
    }

    public void setResume(String resume)
    {
        this.resume = resume;
    }

    public Map getDetail()
    {
        return detail;
    }

    public void setDetail(Map detail)
    {
        this.detail = detail;
    }

    public String getDept_id()
    {
        return dept_id;
    }

    public void setDept_id(String dept_id)
    {
        this.dept_id = dept_id;
    }

    public String getUser_types()
    {
        return user_types;
    }

    public void setUser_types(String user_types)
    {
        this.user_types = user_types;
    }

    public String getDept_name()
    {
        return dept_name;
    }

    public void setDept_name(String dept_name)
    {
        this.dept_name = dept_name;
    }

    public String getEntrust_user_id()
    {
        return entrust_user_id;
    }

    public void setEntrust_user_id(String entrust_user_id)
    {
        this.entrust_user_id = entrust_user_id;
    }

    public String getEntrust_dept_id()
    {
        return entrust_dept_id;
    }

    public void setEntrust_dept_id(String entrust_dept_id)
    {
        this.entrust_dept_id = entrust_dept_id;
    }

    public String getPos_id()
    {
        return pos_id;
    }

    public void setPos_id(String pos_id)
    {
        this.pos_id = pos_id;
    }

    public String getInput_id()
    {
        return input_id;
    }

    public void setInput_id(String input_id)
    {
        this.input_id = input_id;
    }

    public String getInput_name()
    {
        return input_name;
    }

    public void setInput_name(String input_name)
    {
        this.input_name = input_name;
    }

    public List getEntrust_list()
    {
        return entrust_list;
    }

    public void setEntrust_list(List entrust_list)
    {
        this.entrust_list = entrust_list;
    }

    public Integer getIs_del()
    {
        return is_del;
    }

    public void setIs_del(Integer is_del)
    {
        this.is_del = is_del;
    }

    public Integer getStatus()
    {
        return status;
    }

    public void setStatus(Integer status)
    {
        this.status = status;
    }

    public String getIp()
    {
        return ip;
    }

    public void setIp(String ip)
    {
        this.ip = ip;
    }

    public Date getCreate_date()
    {
        return create_date;
    }

    public void setCreate_date(Date create_date)
    {
        this.create_date = create_date;
    }

    public String getOld_pwd()
    {
        return old_pwd;
    }

    public void setOld_pwd(String old_pwd)
    {
        this.old_pwd = old_pwd;
    }

    public String getVali_code()
    {
        return vali_code;
    }

    public void setVali_code(String vali_code)
    {
        this.vali_code = vali_code;
    }

    public String getTelephone()
    {
        return telephone;
    }

    public void setTelephone(String telephone)
    {
        this.telephone = telephone;
    }

    public String getSession_id()
    {
        return session_id;
    }

    public void setSession_id(String session_id)
    {
        this.session_id = session_id;
    }

    public String getClient()
    {
        return client;
    }

    public void setClient(String client)
    {
        this.client = client;
    }

    public String getPos_name()
    {
        return pos_name;
    }

    public void setPos_name(String pos_name)
    {
        this.pos_name = pos_name;
    }

    public String getUser_pwd_md5()
    {
        return user_pwd_md5;
    }

    public void setUser_pwd_md5(String user_pwd_md5)
    {
        this.user_pwd_md5 = user_pwd_md5;
    }

    public String getDomain_name()
    {
        return domain_name;
    }

    public void setDomain_name(String domain_name)
    {
        this.domain_name = domain_name;
    }

    public String getPos_lv()
    {
        return pos_lv;
    }

    public void setPos_lv(String pos_lv)
    {
        this.pos_lv = pos_lv;
    }

    public String getPos_lv_cn()
    {
        return pos_lv_cn;
    }

    public void setPos_lv_cn(String pos_lv_cn)
    {
        this.pos_lv_cn = pos_lv_cn;
    }
}